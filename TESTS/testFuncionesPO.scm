; Definir la funció map
(define (map func llista)
  (cond
    ((null? llista) '()) ; Cas base: si la llista està buida, tornar una llista buida
    (else
     (cons (func (car llista)) ; Aplicar func al primer element
           (map func (cdr llista)))))) ; Cridar recursivament amb la resta de la llista

; Definir la funció filter
(define (filter predicat llista)
  (cond
    ((null? llista) '()) ; Cas base: si la llista està buida, tornar una llista buida
    ((predicat (car llista)) ; Si el predicat és cert per al primer element
     (cons (car llista) ; Incloure el primer element al resultat
           (filter predicat (cdr llista)))) ; Cridar recursivament amb la resta de la llista
    (else (filter predicat (cdr llista))))) ; Si no compleix, ometre l'element


; Map: duplicar cada element d'una llista
(define (duplicar x) (* x 2))
(display (map duplicar '(1 2 3 4))) ; Hauria d'imprimir '(2 4 6 8)
(newline)

; Usar map amb una llista d'un sol element
(display (map duplicar '(5))) ; Hauria d'imprimir '(10)
(newline)

; Usar map amb una funció que sempre retorna el mateix valor
(define (sempre-u x) 1)
(display (map sempre-u '(1 2 3 4))) ; Hauria d'imprimir '(1 1 1 1)
(newline)

; Usar map amb números negatius
(display (map duplicar '(-1 -2 -3))) ; Hauria d'imprimir '(-2 -4 -6)
(newline)

; Filter: filtrar números parells
(define (és-parell? x) (= (mod x 2) 0))
(display (filter és-parell? '(1 2 3 4 5 6))) ; Hauria d'imprimir '(2 4 6)
(newline)

; Usar filter amb una llista d'un sol element
(display (filter és-parell? '(2))) ; Hauria d'imprimir '(2)
(newline)
(display (filter és-parell? '(3))) ; Hauria d'imprimir '()
(newline)

; Usar filter amb números negatius
(display (filter és-parell? '(-1 -2 -3 -4))) ; Hauria d'imprimir '(-2 -4)
(newline)

; Usar filter amb un predicat que sempre retorna cert
(define (sempre-cert x) #t)
(display (filter sempre-cert '(1 2 3 4))) ; Hauria d'imprimir '(1 2 3 4)
(newline)

; Usar filter amb un predicat que sempre retorna fals
(define (sempre-fals x) #f)
(display (filter sempre-fals '(1 2 3 4))) ; Hauria d'imprimir '()
(newline)


; Cas extrem: llistes buides
(display (map duplicar '())) ; Hauria d'imprimir '()
(newline)
(display (filter és-parell? '())) ; Hauria d'imprimir '()
(newline)
