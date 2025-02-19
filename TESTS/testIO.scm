; Test 0
(define (sumar-dos-valors)
(display "Introdueix dos valors: ")
(let ((val1 (read))
        (val2 (read)))
    (display "La suma és: ")
    (display (+ val1 val2))
    (newline)))

; Test 1: Lectura i visualització d'un valor numèric
(display "Introdueix un número: ")
(let ((val (read)))
  (display "Has introduït: ")
  (display val)
  (newline))

; Test 2: Lectura i visualització d'una cadena
(display "Introdueix una cadena (en format 'text'): ")
(let ((cadena (read)))
  (display "Has introduït la cadena: ")
  (display cadena)
  (newline))

; Test 3: Lectura i visualització d'una llista
(display "Introdueix una llista (en format '(1 2 3)): ")
(let ((lst (read)))
  (display "La llista introduïda és: ")
  (display lst)
  (newline))

; Test 4: Lectura i ús de `newline` per formatar sortida
(display "Aquest és un test de formatació:")
(newline)
(display "Línia 1")
(newline)
(display "Línia 2")
(newline)
(display "Final del test")
(newline)

; Test 5: Lectura de múltiples valors amb interacció
(display "Introdueix tres valors: ")
(let ((val1 (read))
      (val2 (read))
      (val3 (read)))
  (display "Els valors introduïts són: ")
  (display val1)
  (display ", ")
  (display val2)
  (display ", i ")
  (display val3)
  (newline))
