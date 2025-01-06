(display (and #t #t)) ; Hauria d'imprimir #t
(display (and #t #f)) ; Hauria d'imprimir #f
(newline)

(display (or #t #f)) ; Hauria d'imprimir #t
(display (or #f #f)) ; Hauria d'imprimir #f
(newline)

(display (not #t)) ; Hauria d'imprimir #f
(display (not #f)) ; Hauria d'imprimir #t
(newline)

; Cas extrem: múltiples condicions
(display (and (= 1 1) (> 2 1) (< 3 4))) ; Hauria d'imprimir #t
(display (or (= 1 2) (< 3 2) (> 4 5))) ; Hauria d'imprimir #f
(newline)
