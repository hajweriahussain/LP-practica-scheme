;; Test de funcions recursives

;; Càlcul del factorial d'un nombre
(define (factorial n)
  (if (= n 0)
      1
      (* n (factorial (- n 1)))))

(display "Factorial de 5: ")
(display (factorial 5)) ; Esperat: 120
(newline)

;; Suma de tots els elements d'una llista
(define (sum-list lst)
  (if (null? lst)
      0
      (+ (car lst) (sum-list (cdr lst)))))

(display "Suma de la llista '(1 2 3 4 5): ")
(display (sum-list '(1 2 3 4 5))) ; Esperat: 15
(newline)

;; Càlcul del n-èsim nombre de Fibonacci
(define (fibonacci n)
  (if (< n 2)
      n
      (+ (fibonacci (- n 1)) (fibonacci (- n 2)))))

(display "Fibonacci de 7: ")
(display (fibonacci 7)) ; Esperat: 13
(newline)
