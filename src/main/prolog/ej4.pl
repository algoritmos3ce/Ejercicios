trenDirecto(saarbruecken,dudweiler).
trenDirecto(forbach,saarbruecken).
trenDirecto(freyming,forbach).
trenDirecto(stAvold,freyming).
trenDirecto(fahlquemont,stAvold).
trenDirecto(metz,fahlquemont).
trenDirecto(nancy,metz).

viajar(X,X).
viajar(X,Y) :- trenDirecto(X,Z), viajar(Z,Y).
