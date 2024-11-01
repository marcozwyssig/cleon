chcp 65001
cmd /c bundle exec asciidoctor-confluence --host %CONFLUENCE_HOST% --spaceKey %CONFLUENCE_SPACE_KEY% --title ReferenceDocumentWith___ --username %CONFLUENCE_USER_NAME% --password %CONFLUENCE_PASSWORD% ReferenceDocumentWith___.adoc
