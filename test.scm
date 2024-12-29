(and (> 3 2) (< 5 10))        ; Debería ser #t
(or (> 3 2) (< 1 0))          ; Debería ser #t
(not (> 3 2))                 ; Debería ser #f
(and #t #f #t)                ; Debería ser #f
(or #f #f #t)                 ; Debería ser #t