
triangle n = sum [1..n]

pyramid n = sum (map (^2) [1..n])

main = do
    putStrLn "triangle numbers:"
    print [(n , triangle n) | n <- [1..10]]
    putStrLn "pyramid numbers:"
    print [(n , pyramid n) | n <- [1..10]]

