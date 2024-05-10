duplicada([]).
duplicada(L) :- append(X, X, L).
