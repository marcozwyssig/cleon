require 'asciidoctor-pdf' # Make sure to include this at the top

class PDFConverterCustomTitlePage < (Asciidoctor::Converter.for 'pdf')
  register_for 'pdf'

  def ink_title_page doc
    theme_font :title_page do
      # Add the logo to the title page
      if (title_page_logo_image = (theme.title_page_logo_image rescue nil))
        logo_width = bounds.width * 0.5
        image_position = case theme.title_page_logo_align
                         when 'right'
                            bounds.width - logo_width
                         when 'center'
                            (bounds.width - logo_width) * 0.5
                         else
                            0
                         end
        top_position = bounds.top - (bounds.height * theme.title_page_logo_top.to_f / 100.0)

        themes_dir = doc.attr('pdf-themesdir')
        logo_path = themes_dir ? File.join(themes_dir, title_page_logo_image) : title_page_logo_image
        image logo_path, at: [image_position, top_position], width: logo_width
      end

      # Main title with a specific font size, assuming you have a title defined in your document
      move_down 100
      theme_font :title_page_title do
        text doc.doctitle, align: :center, size: 24
      end

      # Subtitle, again assuming you have this set in your document attributes
      move_down 10
      theme_font :title_page_subtitle do
        subtitle = (doc.attr? 'subtitle') ? doc.attr('subtitle') : ""
        text subtitle, align: :center, size: 16
      end

      move_down 40

      # Here you would insert the image of your product
      # product_image_path = doc.attr 'product-image'
      # image product_image_path, position: :center if product_image_path

      move_down 400 # Adjust this value as needed to position your table
      ink_title_page_table(doc)
    end
  end

  def ink_title_page_table(doc)
    # Fetch the document attributes
    doc_id = doc.attr 'doc-id'
    revnumber = doc.attr 'revnumber'
    revdate = doc.attr 'revdate'
    status = doc.attr 'revremark'
    classification = doc.attr 'classification'

    # The data array now uses the fetched values
    data = [
        ['Reference:', doc_id || 'N/A'],
        ['Revision:', revnumber || 'N/A'],
        ['Date:', revdate || 'N/A'],
        ['State:', status || 'N/A'],
        ['Classification:', classification || 'N/A']
    ]
  
    # Table style adjustments can be made within the block passed to the `table` method.
    table(data, position: :center, width: bounds.width * 0.5) do
        # Adjust the column widths as necessary. Here, I'm assuming the first column is narrower.
        column_widths = { 0 => 150, 1 => 200 }
      
        # General styling for all cells
        cells.borders = []
        cells.padding = [3, 5, 3, 5]  # top, right, bottom, left padding
        cells.border_color = 'dddddd'
      
        columns(0).align = :right
        columns(1).align = :left
      
        # Ensure the table is positioned in the center of the page
        self.position = :center
    end
    
    move_down 10
    organization = doc.attr 'organization'
    text "© #{organization} #{Time.now.year}", align: :center, size: 10    
  end
end

