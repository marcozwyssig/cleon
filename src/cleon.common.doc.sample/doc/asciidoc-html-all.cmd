chcp 65001
cmd /c bundle exec asciidoctor -r asciidoctor-diagram -a data-uri arc42/adoc/de/arc42.adoc
cmd /c bundle exec asciidoctor -r asciidoctor-diagram -a data-uri arc42/adoc/en/arc42.adoc
cmd /c bundle exec asciidoctor -r asciidoctor-diagram -a data-uri reference/adoc/de/referencedocumentwith___.adoc
