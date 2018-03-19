chcp 65001
cmd /c bundle exec asciidoctor -r asciidoctor-diagram -a data-uri Readme.adoc
cmd /c bundle exec asciidoctor -r asciidoctor-diagram -a data-uri analysis/Analyse_A/Analyse_A.adoc
cmd /c bundle exec asciidoctor -r asciidoctor-diagram -a data-uri analysis/Analyse_B/Analyse_B.adoc
