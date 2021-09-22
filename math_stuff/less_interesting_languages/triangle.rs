// run with `rustc triangle.rs && ./triangle`

fn triangle(num: u32) -> u32 {
    (1..=num).sum()
}

fn pyramid(num: u32) -> u32 {
    (1..=num).map(|x| x*x).sum()
}

fn main() {
    println!("triangle numbers:");
    for i in 0..=10 {
        print!("{} ", triangle(i));
    }

    println!("");
    println!("pyramid numbers:");
    for i in 0..=10 {
        print!("{} ", pyramid(i));
    }
    println!("");
}

