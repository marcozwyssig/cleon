chcp 65001
cmd /c bundle exec asciidoctor -r asciidoctor-diagram -a data-uri arc42/de/arc42.adoc
cmd /c bundle exec asciidoctor -r asciidoctor-diagram -a data-uri arc42/en/arc42.adoc
cmd /c bundle exec asciidoctor -r asciidoctor-diagram -a data-uri reference/de/referencedocumentwith___.adoc
