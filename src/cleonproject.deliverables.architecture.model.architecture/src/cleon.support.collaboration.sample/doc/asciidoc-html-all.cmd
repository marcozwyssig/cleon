chcp 65001
cmd /c bundle exec asciidoctor -r asciidoctor-diagram -a data-uri cleon_collaboration_sample_doc_arc42/arc42.adoc
cmd /c bundle exec asciidoctor -r asciidoctor-diagram -a data-uri cleon_collaboration_sample_arc42/Chess_Architecture.adoc
cmd /c bundle exec asciidoctor -r asciidoctor-diagram -a data-uri cleon_collaboration_sample_doc_reference/ReferenceDocumentWith___.adoc
cmd /c bundle exec asciidoctor -r asciidoctor-diagram -a data-uri cleon_collaboration_sample_togaf/TestReferenceArc42_Architecture.adoc
cmd /c bundle exec asciidoctor -r asciidoctor-diagram -a data-uri cleon_collaboration_sample_software/SampleArchitecture_Architecture.adoc
cmd /c bundle exec asciidoctor -r asciidoctor-diagram -a data-uri cleon_collaboration_sample_togaf/TestSolutionArc42_Architecture.adoc
cmd /c bundle exec asciidoctor -r asciidoctor-diagram -a data-uri cleon_collaboration_sample_plattform/MyPlattform_Architecture.adoc
