chcp 65001
cmd /c bundle exec asciidoctor -r asciidoctor-diagram -a data-uri Readme.adoc
cmd /c bundle exec asciidoctor -r asciidoctor-diagram -a data-uri Analyse_A.adoc
cmd /c bundle exec asciidoctor -r asciidoctor-diagram -a data-uri Analyse_B.adoc
