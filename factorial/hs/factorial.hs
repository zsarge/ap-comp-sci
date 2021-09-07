
factorial :: Integer -> Integer
factorial n = foldr (*) 1 [1..n]

main :: IO ()
main = print $ [factorial n | n <- [1..10]]

