function f
  params
    _result boolean
    a integer
    b float
  endparams

  vars
    x integer
    y boolean
    z integer 10
  endvars

     %1 = 9
     %2 = 67
     %3 = a + %2
     z[%1] = %3
     %4 = 34
     x = %4
     %5 = 3
     %6 = 56
     %7 = 9
     %8 = z[%7]
     %9 = %6 + %8
     z[%5] = %9
     %10 = 3
     %11 = z[%10]
     %14 = float %11
     %13 = %14 <=. b
     %12 = not %13
     ifFalse %12 goto If1
     %15 = 78
     x = %15
     writef b
     writes "\n"
     goto Else1
  label If1 :
     %16 = 99
     x = %16
  label Else1 :
     %17 = 3
     %18 = z[%17]
     writei %18
     writes "\n"
     %19 = 1
     _result = %19
     return
     return
endfunction

function fz
  params
    r integer
  endparams

  label While1 :
     %1 = 0
     %3 = r <= %1
     %2 = not %3
     ifFalse %2 goto EndWhile1
     %4 = 1
     %5 = r - %4
     r = %5
     goto While1
  label EndWhile1 :
     return
endfunction

function main
  vars
    a integer
  endvars

     pushparam 
     %2 = 3
     pushparam %2
     %3 = 2
     %4 = float %3
     pushparam %4
     call f
     popparam 
     popparam 
     popparam %1
     ifFalse %1 goto Endif1
     %5 = 3.7
     %6 = float a
     %7 = %6 +. %5
     %8 = 4
     %9 = float %8
     %10 = %7 +. %9
     writef %10
     writes "\n"
  label Endif1 :
     return
endfunction


