; Ús de LET per definir variables temporals
(let ((a 10)
      (b 20))
  (display "La suma és: ")
  (display (+ a b))
  (newline))

; Test 1: LET amb múltiples càlculs
(display "LET amb càlculs intermedis:")
(let ((x 5)
      (y 3))
  (display "El producte de x i y és: ")
  (display (* x y))
  (newline)
  (display "La resta de x i y és: ")
  (display (- x y))
  (newline))

; Test 2: LET dins d'una funció
(define (calcula-area-rectangle ample llarg)
  (let ((area (* ample llarg)))
    (display "L'àrea del rectangle és: ")
    (display area)
    (newline)))

(calcula-area-rectangle 4 5) ; Hauria d'imprimir 20

; Test 3: LET anidat (nested)
(display "LET anidat:")
(let ((x 2)
      (y 3))
  (let ((z (+ x y)))
    (display "x + y = ")
    (display z)
    (newline)
    (let ((w (* z 2)))
      (display "z * 2 = ")
      (display w)
      (newline))))

; Test 4: LET amb llistes
(display "LET amb llistes:")
(let ((lst '(1 2 3 4)))
  (newline)
  (display "El primer element és: ")
  (display (car lst))
  (newline))
