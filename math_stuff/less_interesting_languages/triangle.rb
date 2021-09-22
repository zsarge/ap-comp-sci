# run with `ruby triangle.rb`

def triangle_number(n)
  (1..n).sum
end

def pyramid_number(n)
  (1..n).map{|n| n ** 2}.sum
end

puts "triangle numbers"
p (0..10).map{|n| triangle_number n}
puts "pyramid numbers"
p (0..10).map{|n| pyramid_number n}

