espejo(hoja(X), hoja(X)).
espejo(arbol(A, B), arbol(C, D)) :- espejo(A, D), espejo(B, C).
