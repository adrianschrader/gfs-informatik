# gfs-informatik

Presentation and project documentation about the basics of test driven
development and explains common errors.  

## Abstract from the documentation (german)

## Building instructions

This projects uses a central Makefile for all building activities that depends
on your command line LaTeX distribution.

```bash
git clone git@gitlab.com:adrianschrader1/gfs-nmr.git
cd gfs-nmr

make all # Make all projects
make doc # Only build the written documentation
make beamer # Only build the beamer presentation

make clean # Delete all temporary build files, will preserve your PDF output
```

All projects share the same resources via symlinks. Should those not work on
your workstation update them like this:

```bash
sudo chmod +x configure.sh
./configure.sh
```

## Dependencies

Make sure you have following software installed and updated on your workstation:

*   LaTeX distribution for your operating system (e.g [MacTeX](https://tug.org/mactex/) or [MiKTeX](http://miktex.org/))
*   [mtheme](https://github.com/matze/mtheme) beamer theme (make sure you have installed the theme via ``make all && make install`` and are up to date)
*   [FiraSans](https://github.com/mozilla/Fira) font package
*   Xcode command line tools for make
*   [Atom 1.0](https://atom.io) with the [build](https://atom.io/packages/build) and [build-make](https://atom.io/packages/build-make) packages are recommended to compile the project on the fly
