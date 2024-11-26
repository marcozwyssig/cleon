chcp 65001
cmd /c bundle exec asciidoctor-confluence --host %CONFLUENCE_HOST% --spaceKey %CONFLUENCE_SPACE_KEY% --title Sample_Simple_Analyse --username %CONFLUENCE_USER_NAME% --password %CONFLUENCE_PASSWORD% Sample_Simple_Analyse.adoc
