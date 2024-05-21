(ns main.clojure.ej9)

(defn rutas [d a]
  (if (= [d a] [0 0])
    '("")
    (let [rutas-d (if (pos? d) (rutas (dec d) a) nil)
          rutas-a (if (pos? a) (rutas d (dec a)) nil)]
      (concat (map #(str \d %) rutas-d) (map #(str \a %) rutas-a)))))

(assert (= #{"ddaa" "dada" "daad" "adda" "adad" "aadd"} (set (rutas 2 2))))
