traduccion(eins,uno).
traduccion(zwei,dos).
traduccion(drei,tres).
traduccion(vier,cuatro).
traduccion(fuenf,cinco).
traduccion(sechs,seis).
traduccion(sieben,siete).
traduccion(acht,ocho).
traduccion(neun,nueve).

traduccionLista([], []).
traduccionLista([H|Hs], [T|Ts]) :- traduccion(H,T), traduccionLista(Hs, Ts).
