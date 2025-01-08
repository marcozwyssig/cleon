chcp 65001
cmd /c bundle exec asciidoctor-confluence --host %CONFLUENCE_HOST% --spaceKey %CONFLUENCE_SPACE_KEY% --title sample_simple_analyse_detailstudie --username %CONFLUENCE_USER_NAME% --password %CONFLUENCE_PASSWORD% sample_simple_analyse_detailstudie.adoc
