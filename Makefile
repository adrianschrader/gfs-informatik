PATH := $(PATH):/Library/TeX/texbin
filename-doc=doc
filename-beamer=beamer
directory-doc=doc/
directory-beamer=beamer/

.PHONY: all doc beamer doc-pvc beamer-pvc clean

all: doc beamer

doc:
	cd ${directory-doc} && latexmk -pdf -xelatex -use-make ${filename-doc}.tex

doc-pvc:
	cd ${directory-doc} && latexmk -pdf -pvc -xelatex -use-make ${filename-doc}.tex

beamer:
	cd ${directory-beamer} && latexmk -pdf -xelatex -shell-escape  ${filename-beamer}.tex

beamer-pvc:
	cd ${directory-beamer} && latexmk -pvc -pdf -xelatex -shell-escape -use-make ${filename-beamer}.tex

clean:
	cd ${directory-doc} && latexmk -c
	cd ${directory-beamer} && latexmk -c
	rm -f ${directory-doc}${filename-doc}.{ps,log,aux,out,dvi,bbl,blg,toc,fls,fdb_latexmk,xml,run.xml}
	rm -f ${directory-beamer}${filename-beamer}.{ps,log,aux,out,dvi,bbl,blg,bcf,toc,fls,fdb_latexmk,nav,snm,vrb,toc,xml,run.xml}
	rm -rf **/*.{ps,log,aux,out,dvi,bbl,blg,bcf,toc,fls,fdb_latexmk,nav,snm,vrb,toc,xml,run.xml}
