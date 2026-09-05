// This Hugo project is a Go module, because the theme is one: `hugo mod get` needs a module to write the
// pinned requirement into. The path never resolves to anything - nothing imports this - so it only has to
// be unique, and the repository's own URL is the honest choice.
module github.com/marcozwyssig/cleon/site

go 1.21

require github.com/imfing/hextra v0.9.6 // indirect
