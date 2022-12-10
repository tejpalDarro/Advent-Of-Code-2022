let SessionLoad = 1
let s:so_save = &g:so | let s:siso_save = &g:siso | setg so=0 siso=0 | setl so=-1 siso=-1
let v:this_session=expand("<sfile>:p")
silent only
silent tabonly
cd ~/Documents/javaAlgo/neet/AOC2022
if expand('%') == '' && !&modified && line('$') <= 1 && getline(1) == ''
  let s:wipebuf = bufnr('%')
endif
let s:shortmess_save = &shortmess
if &shortmess =~ 'A'
  set shortmess=aoOA
else
  set shortmess=aoO
endif
badd +19 Day2.java
badd +5 input.txt
badd +4 ~/Documents/javaAlgo/neet/AOC2022/Day3.java
badd +70 ~/Documents/javaAlgo/neet/AOC2022/Day3next.java
badd +1 ~/Documents/javaAlgo/neet/AOC2022/Day4.java
badd +15 ~/Documents/javaAlgo/neet/AOC2022/Day1.java
badd +1 ~/Documents/javaAlgo/neet/AOC2022/Day5.java
badd +5 ~/Documents/javaAlgo/neet/AOC2022/Day2next.java
badd +64 ~/Documents/javaAlgo/neet/AOC2022/Test.java
badd +1 ~/Documents/javaAlgo/neet/AOC2022/Day7.java
badd +30 ~/Documents/javaAlgo/neet/AOC2022/Day7New.java
badd +1 ~/Documents/javaAlgo/Aoc/Day5.java
badd +1 ~/Documents/javaAlgo/neet/AOC2022/Day8.java
badd +26 ~/Documents/javaAlgo/neet/AOC2022/Day8New.java
badd +1 term://~/Documents/javaAlgo/neet/AOC2022//2980:C:/Windows/system32/cmd.exe
badd +327 term://~/Documents/javaAlgo/neet/AOC2022//6320:C:/Windows/system32/cmd.exe
badd +1 term://~/Documents/javaAlgo/neet/AOC2022//25044:C:/Windows/system32/cmd.exe
badd +1 term://~/Documents/javaAlgo/neet/AOC2022//6512:C:/Windows/system32/cmd.exe
badd +1 term://~/Documents/javaAlgo/neet/AOC2022//11272:C:/Windows/system32/cmd.exe
badd +49 ~/Documents/javaAlgo/neet/AOC2022/Day9.java
badd +0 ~/Documents/javaAlgo/neet/AOC2022/Day10.java
argglobal
%argdel
set stal=2
tabnew +setlocal\ bufhidden=wipe
tabnew +setlocal\ bufhidden=wipe
tabnew +setlocal\ bufhidden=wipe
tabnew +setlocal\ bufhidden=wipe
tabnew +setlocal\ bufhidden=wipe
tabnew +setlocal\ bufhidden=wipe
tabnew +setlocal\ bufhidden=wipe
tabnew +setlocal\ bufhidden=wipe
tabnew +setlocal\ bufhidden=wipe
tabnew +setlocal\ bufhidden=wipe
tabrewind
edit ~/Documents/javaAlgo/neet/AOC2022/Day1.java
argglobal
setlocal fdm=manual
setlocal fde=0
setlocal fmr={{{,}}}
setlocal fdi=#
setlocal fdl=0
setlocal fml=1
setlocal fdn=20
setlocal fen
silent! normal! zE
let &fdl = &fdl
let s:l = 31 - ((28 * winheight(0) + 24) / 48)
if s:l < 1 | let s:l = 1 | endif
keepjumps exe s:l
normal! zt
keepjumps 31
normal! 08|
tabnext
edit ~/Documents/javaAlgo/neet/AOC2022/Day7.java
let s:save_splitbelow = &splitbelow
let s:save_splitright = &splitright
set splitbelow splitright
wincmd _ | wincmd |
vsplit
1wincmd h
wincmd w
let &splitbelow = s:save_splitbelow
let &splitright = s:save_splitright
wincmd t
let s:save_winminheight = &winminheight
let s:save_winminwidth = &winminwidth
set winminheight=0
set winheight=1
set winminwidth=0
set winwidth=1
exe 'vert 1resize ' . ((&columns * 103 + 106) / 213)
exe 'vert 2resize ' . ((&columns * 93 + 106) / 213)
argglobal
setlocal fdm=manual
setlocal fde=0
setlocal fmr={{{,}}}
setlocal fdi=#
setlocal fdl=0
setlocal fml=1
setlocal fdn=20
setlocal fen
silent! normal! zE
let &fdl = &fdl
let s:l = 62 - ((0 * winheight(0) + 24) / 48)
if s:l < 1 | let s:l = 1 | endif
keepjumps exe s:l
normal! zt
keepjumps 62
normal! 029|
wincmd w
argglobal
if bufexists(fnamemodify("input.txt", ":p")) | buffer input.txt | else | edit input.txt | endif
if &buftype ==# 'terminal'
  silent file input.txt
endif
balt ~/Documents/javaAlgo/neet/AOC2022/Day7.java
setlocal fdm=manual
setlocal fde=0
setlocal fmr={{{,}}}
setlocal fdi=#
setlocal fdl=0
setlocal fml=1
setlocal fdn=20
setlocal fen
silent! normal! zE
let &fdl = &fdl
let s:l = 1 - ((0 * winheight(0) + 24) / 48)
if s:l < 1 | let s:l = 1 | endif
keepjumps exe s:l
normal! zt
keepjumps 1
normal! 0
wincmd w
exe 'vert 1resize ' . ((&columns * 103 + 106) / 213)
exe 'vert 2resize ' . ((&columns * 93 + 106) / 213)
tabnext
edit Day2.java
argglobal
balt ~/Documents/javaAlgo/neet/AOC2022/Day4.java
setlocal fdm=manual
setlocal fde=0
setlocal fmr={{{,}}}
setlocal fdi=#
setlocal fdl=0
setlocal fml=1
setlocal fdn=20
setlocal fen
silent! normal! zE
let &fdl = &fdl
let s:l = 9 - ((8 * winheight(0) + 24) / 48)
if s:l < 1 | let s:l = 1 | endif
keepjumps exe s:l
normal! zt
keepjumps 9
normal! 0
tabnext
edit ~/Documents/javaAlgo/neet/AOC2022/Day3next.java
argglobal
balt ~/Documents/javaAlgo/neet/AOC2022/Day2next.java
setlocal fdm=manual
setlocal fde=0
setlocal fmr={{{,}}}
setlocal fdi=#
setlocal fdl=0
setlocal fml=1
setlocal fdn=20
setlocal fen
silent! normal! zE
let &fdl = &fdl
let s:l = 51 - ((47 * winheight(0) + 24) / 48)
if s:l < 1 | let s:l = 1 | endif
keepjumps exe s:l
normal! zt
keepjumps 51
normal! 015|
tabnext
edit ~/Documents/javaAlgo/neet/AOC2022/Day8.java
let s:save_splitbelow = &splitbelow
let s:save_splitright = &splitright
set splitbelow splitright
wincmd _ | wincmd |
vsplit
1wincmd h
wincmd w
let &splitbelow = s:save_splitbelow
let &splitright = s:save_splitright
wincmd t
let s:save_winminheight = &winminheight
let s:save_winminwidth = &winminwidth
set winminheight=0
set winheight=1
set winminwidth=0
set winwidth=1
exe 'vert 1resize ' . ((&columns * 146 + 106) / 213)
exe 'vert 2resize ' . ((&columns * 50 + 106) / 213)
argglobal
setlocal fdm=manual
setlocal fde=0
setlocal fmr={{{,}}}
setlocal fdi=#
setlocal fdl=0
setlocal fml=1
setlocal fdn=20
setlocal fen
silent! normal! zE
let &fdl = &fdl
let s:l = 55 - ((29 * winheight(0) + 24) / 48)
if s:l < 1 | let s:l = 1 | endif
keepjumps exe s:l
normal! zt
keepjumps 55
normal! 032|
wincmd w
argglobal
if bufexists(fnamemodify("input.txt", ":p")) | buffer input.txt | else | edit input.txt | endif
if &buftype ==# 'terminal'
  silent file input.txt
endif
balt ~/Documents/javaAlgo/neet/AOC2022/Day8.java
setlocal fdm=manual
setlocal fde=0
setlocal fmr={{{,}}}
setlocal fdi=#
setlocal fdl=0
setlocal fml=1
setlocal fdn=20
setlocal fen
silent! normal! zE
let &fdl = &fdl
let s:l = 1 - ((0 * winheight(0) + 24) / 48)
if s:l < 1 | let s:l = 1 | endif
keepjumps exe s:l
normal! zt
keepjumps 1
normal! 0
wincmd w
exe 'vert 1resize ' . ((&columns * 146 + 106) / 213)
exe 'vert 2resize ' . ((&columns * 50 + 106) / 213)
tabnext
edit ~/Documents/javaAlgo/neet/AOC2022/Day8New.java
argglobal
balt input.txt
setlocal fdm=manual
setlocal fde=0
setlocal fmr={{{,}}}
setlocal fdi=#
setlocal fdl=0
setlocal fml=1
setlocal fdn=20
setlocal fen
silent! normal! zE
let &fdl = &fdl
let s:l = 49 - ((0 * winheight(0) + 27) / 55)
if s:l < 1 | let s:l = 1 | endif
keepjumps exe s:l
normal! zt
keepjumps 49
normal! 017|
tabnext
edit ~/Documents/javaAlgo/neet/AOC2022/Day9.java
let s:save_splitbelow = &splitbelow
let s:save_splitright = &splitright
set splitbelow splitright
wincmd _ | wincmd |
vsplit
1wincmd h
wincmd w
let &splitbelow = s:save_splitbelow
let &splitright = s:save_splitright
wincmd t
let s:save_winminheight = &winminheight
let s:save_winminwidth = &winminwidth
set winminheight=0
set winheight=1
set winminwidth=0
set winwidth=1
exe 'vert 1resize ' . ((&columns * 153 + 106) / 213)
exe 'vert 2resize ' . ((&columns * 59 + 106) / 213)
argglobal
balt input.txt
setlocal fdm=manual
setlocal fde=0
setlocal fmr={{{,}}}
setlocal fdi=#
setlocal fdl=0
setlocal fml=1
setlocal fdn=20
setlocal fen
silent! normal! zE
let &fdl = &fdl
let s:l = 79 - ((0 * winheight(0) + 23) / 47)
if s:l < 1 | let s:l = 1 | endif
keepjumps exe s:l
normal! zt
keepjumps 79
normal! 013|
wincmd w
argglobal
if bufexists(fnamemodify("input.txt", ":p")) | buffer input.txt | else | edit input.txt | endif
if &buftype ==# 'terminal'
  silent file input.txt
endif
balt ~/Documents/javaAlgo/neet/AOC2022/Day8New.java
setlocal fdm=manual
setlocal fde=0
setlocal fmr={{{,}}}
setlocal fdi=#
setlocal fdl=0
setlocal fml=1
setlocal fdn=20
setlocal fen
silent! normal! zE
let &fdl = &fdl
let s:l = 1 - ((0 * winheight(0) + 23) / 47)
if s:l < 1 | let s:l = 1 | endif
keepjumps exe s:l
normal! zt
keepjumps 1
normal! 0
wincmd w
exe 'vert 1resize ' . ((&columns * 153 + 106) / 213)
exe 'vert 2resize ' . ((&columns * 59 + 106) / 213)
tabnext
edit ~/Documents/javaAlgo/neet/AOC2022/Day10.java
argglobal
balt ~/Documents/javaAlgo/neet/AOC2022/Day9.java
setlocal fdm=manual
setlocal fde=0
setlocal fmr={{{,}}}
setlocal fdi=#
setlocal fdl=0
setlocal fml=1
setlocal fdn=20
setlocal fen
silent! normal! zE
let &fdl = &fdl
let s:l = 1 - ((0 * winheight(0) + 23) / 47)
if s:l < 1 | let s:l = 1 | endif
keepjumps exe s:l
normal! zt
keepjumps 1
normal! 0
tabnext
edit ~/Documents/javaAlgo/Aoc/Day5.java
let s:save_splitbelow = &splitbelow
let s:save_splitright = &splitright
set splitbelow splitright
wincmd _ | wincmd |
vsplit
1wincmd h
wincmd w
let &splitbelow = s:save_splitbelow
let &splitright = s:save_splitright
wincmd t
let s:save_winminheight = &winminheight
let s:save_winminwidth = &winminwidth
set winminheight=0
set winheight=1
set winminwidth=0
set winwidth=1
exe 'vert 1resize ' . ((&columns * 98 + 106) / 213)
exe 'vert 2resize ' . ((&columns * 98 + 106) / 213)
argglobal
balt ~/Documents/javaAlgo/neet/AOC2022/Day8New.java
setlocal fdm=manual
setlocal fde=0
setlocal fmr={{{,}}}
setlocal fdi=#
setlocal fdl=0
setlocal fml=1
setlocal fdn=20
setlocal fen
silent! normal! zE
let &fdl = &fdl
let s:l = 3 - ((2 * winheight(0) + 24) / 48)
if s:l < 1 | let s:l = 1 | endif
keepjumps exe s:l
normal! zt
keepjumps 3
normal! 0
wincmd w
argglobal
if bufexists(fnamemodify("input.txt", ":p")) | buffer input.txt | else | edit input.txt | endif
if &buftype ==# 'terminal'
  silent file input.txt
endif
balt ~/Documents/javaAlgo/neet/AOC2022/Day8New.java
setlocal fdm=manual
setlocal fde=0
setlocal fmr={{{,}}}
setlocal fdi=#
setlocal fdl=0
setlocal fml=1
setlocal fdn=20
setlocal fen
silent! normal! zE
let &fdl = &fdl
let s:l = 1 - ((0 * winheight(0) + 24) / 48)
if s:l < 1 | let s:l = 1 | endif
keepjumps exe s:l
normal! zt
keepjumps 1
normal! 0
wincmd w
exe 'vert 1resize ' . ((&columns * 98 + 106) / 213)
exe 'vert 2resize ' . ((&columns * 98 + 106) / 213)
tabnext
edit ~/Documents/javaAlgo/neet/AOC2022/Day4.java
let s:save_splitbelow = &splitbelow
let s:save_splitright = &splitright
set splitbelow splitright
wincmd _ | wincmd |
vsplit
1wincmd h
wincmd w
let &splitbelow = s:save_splitbelow
let &splitright = s:save_splitright
wincmd t
let s:save_winminheight = &winminheight
let s:save_winminwidth = &winminwidth
set winminheight=0
set winheight=1
set winminwidth=0
set winwidth=1
exe 'vert 1resize ' . ((&columns * 104 + 106) / 213)
exe 'vert 2resize ' . ((&columns * 92 + 106) / 213)
argglobal
balt ~/Documents/javaAlgo/neet/AOC2022/Day3next.java
setlocal fdm=manual
setlocal fde=0
setlocal fmr={{{,}}}
setlocal fdi=#
setlocal fdl=0
setlocal fml=1
setlocal fdn=20
setlocal fen
silent! normal! zE
let &fdl = &fdl
let s:l = 30 - ((27 * winheight(0) + 24) / 48)
if s:l < 1 | let s:l = 1 | endif
keepjumps exe s:l
normal! zt
keepjumps 30
normal! 020|
wincmd w
argglobal
if bufexists(fnamemodify("input.txt", ":p")) | buffer input.txt | else | edit input.txt | endif
if &buftype ==# 'terminal'
  silent file input.txt
endif
balt Day2.java
setlocal fdm=manual
setlocal fde=0
setlocal fmr={{{,}}}
setlocal fdi=#
setlocal fdl=0
setlocal fml=1
setlocal fdn=20
setlocal fen
silent! normal! zE
let &fdl = &fdl
let s:l = 1 - ((0 * winheight(0) + 24) / 48)
if s:l < 1 | let s:l = 1 | endif
keepjumps exe s:l
normal! zt
keepjumps 1
normal! 0
wincmd w
exe 'vert 1resize ' . ((&columns * 104 + 106) / 213)
exe 'vert 2resize ' . ((&columns * 92 + 106) / 213)
tabnext
edit ~/Documents/javaAlgo/neet/AOC2022/Day5.java
let s:save_splitbelow = &splitbelow
let s:save_splitright = &splitright
set splitbelow splitright
wincmd _ | wincmd |
vsplit
wincmd _ | wincmd |
vsplit
2wincmd h
wincmd w
wincmd w
let &splitbelow = s:save_splitbelow
let &splitright = s:save_splitright
wincmd t
let s:save_winminheight = &winminheight
let s:save_winminwidth = &winminwidth
set winminheight=0
set winheight=1
set winminwidth=0
set winwidth=1
exe 'vert 1resize ' . ((&columns * 62 + 106) / 213)
exe 'vert 2resize ' . ((&columns * 71 + 106) / 213)
exe 'vert 3resize ' . ((&columns * 62 + 106) / 213)
argglobal
balt input.txt
setlocal fdm=manual
setlocal fde=0
setlocal fmr={{{,}}}
setlocal fdi=#
setlocal fdl=0
setlocal fml=1
setlocal fdn=20
setlocal fen
silent! normal! zE
let &fdl = &fdl
let s:l = 19 - ((17 * winheight(0) + 24) / 48)
if s:l < 1 | let s:l = 1 | endif
keepjumps exe s:l
normal! zt
keepjumps 19
normal! 09|
wincmd w
argglobal
if bufexists(fnamemodify("~/Documents/javaAlgo/neet/AOC2022/Test.java", ":p")) | buffer ~/Documents/javaAlgo/neet/AOC2022/Test.java | else | edit ~/Documents/javaAlgo/neet/AOC2022/Test.java | endif
if &buftype ==# 'terminal'
  silent file ~/Documents/javaAlgo/neet/AOC2022/Test.java
endif
balt ~/Documents/javaAlgo/neet/AOC2022/Day5.java
setlocal fdm=manual
setlocal fde=0
setlocal fmr={{{,}}}
setlocal fdi=#
setlocal fdl=0
setlocal fml=1
setlocal fdn=20
setlocal fen
silent! normal! zE
let &fdl = &fdl
let s:l = 63 - ((14 * winheight(0) + 24) / 48)
if s:l < 1 | let s:l = 1 | endif
keepjumps exe s:l
normal! zt
keepjumps 63
normal! 020|
wincmd w
argglobal
if bufexists(fnamemodify("input.txt", ":p")) | buffer input.txt | else | edit input.txt | endif
if &buftype ==# 'terminal'
  silent file input.txt
endif
balt ~/Documents/javaAlgo/neet/AOC2022/Day5.java
setlocal fdm=manual
setlocal fde=0
setlocal fmr={{{,}}}
setlocal fdi=#
setlocal fdl=0
setlocal fml=1
setlocal fdn=20
setlocal fen
silent! normal! zE
let &fdl = &fdl
let s:l = 1 - ((0 * winheight(0) + 24) / 48)
if s:l < 1 | let s:l = 1 | endif
keepjumps exe s:l
normal! zt
keepjumps 1
normal! 0
wincmd w
exe 'vert 1resize ' . ((&columns * 62 + 106) / 213)
exe 'vert 2resize ' . ((&columns * 71 + 106) / 213)
exe 'vert 3resize ' . ((&columns * 62 + 106) / 213)
tabnext 8
set stal=1
if exists('s:wipebuf') && len(win_findbuf(s:wipebuf)) == 0 && getbufvar(s:wipebuf, '&buftype') isnot# 'terminal'
  silent exe 'bwipe ' . s:wipebuf
endif
unlet! s:wipebuf
set winheight=1 winwidth=20
let &shortmess = s:shortmess_save
let &winminheight = s:save_winminheight
let &winminwidth = s:save_winminwidth
let s:sx = expand("<sfile>:p:r")."x.vim"
if filereadable(s:sx)
  exe "source " . fnameescape(s:sx)
endif
let &g:so = s:so_save | let &g:siso = s:siso_save
set hlsearch
doautoall SessionLoadPost
unlet SessionLoad
" vim: set ft=vim :
