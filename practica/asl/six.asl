func f(a:int, f:float): bool
  var x:int
  var b:bool
  var z:array[10] of int
  read z[5];
  write z[5]-88*f;
  read b;
  read f;
  if b then
     write "h\n\tl\\a";
     write ---f;
     write "\n";
  endif
  return true;
endfunc

func fz(r:int, u:float) : float
  var b: bool
  while r>0.01 do
    r = r-1;
  endwhile
  if r == 0 then
    b = f(55555, -5/4);
  endif
  return (r+3)*u;
endfunc

func main()
  var a:int
  var q :float
  q = -1;
  q = fz(3+4, fz(4444, q+3));
  write q+3.7+4;
  write "\n";
endfunc
