u = [1 ,2 ,7 ,9 ,11 ,15]
v = [3 ,5 ,8 ,100 ,130 ,275]
a = []
p = 0
q = 0
for i in range (len (u ) + len (v ) ) :
    if (p < len ( u ) and q < len ( v ) ) :
        a. append ( min ( u [ p ] , v [ q ]) )
        if ( min ( u [ p ] , v [ q ]) == u [ p ]) :
            p = p +1
        else :
            q = q +1
    elif (p >= len (u ) ) :
        a. append ( v [ q ])
        q = q +1
    else :
        a. append ( u [ p ])
        p = p + 1
print(a)
