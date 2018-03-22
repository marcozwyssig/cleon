chcp 65001
cmd /c bundle exec asciidoctor -r asciidoctor-diagram -a data-uri Chess.adoc
cmd /c bundle exec asciidoctor -r asciidoctor-diagram -a data-uri TestReferenceArc42.adoc
cmd /c bundle exec asciidoctor -r asciidoctor-diagram -a data-uri SampleArchitecture.adoc
cmd /c bundle exec asciidoctor -r asciidoctor-diagram -a data-uri TestSolutionArc42.adoc
