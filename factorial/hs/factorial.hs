
{-

Run with: 
`runhaskell factorial.hs`
or 
`ghc factorial.hs && ./factorial`

-}

factorial :: Integer -> Integer
factorial n = foldr (*) 1 [1..n]

factorials :: [Integer]
factorials = drop 1 $ scanl (*) 1 [1..]

main :: IO ()
main = do 
    print $ [factorial n | n <- [1..10]]
    print $ take 10 factorials

