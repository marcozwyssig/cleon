chcp 65001
cmd /c bundle exec asciidoctor-confluence --host %CONFLUENCE_HOST% --spaceKey %CONFLUENCE_SPACE_KEY% --title monolith_softwarearchitecture --username %CONFLUENCE_USER_NAME% --password %CONFLUENCE_PASSWORD% monolith_softwarearchitecture.adoc
