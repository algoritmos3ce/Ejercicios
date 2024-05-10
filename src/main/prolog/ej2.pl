palabra(determinante,el).
palabra(determinante,un).
palabra(nucleo,pez).
palabra(nucleo,'alfajor triple').
palabra(verbo,come).
palabra(verbo,compra).

oracion(Palabra1,Palabra2,Palabra3,Palabra4,Palabra5):-
   palabra(determinante,Palabra1),
   palabra(nucleo,Palabra2),
   palabra(verbo,Palabra3),
   palabra(determinante,Palabra4),
   palabra(nucleo,Palabra5).
