# javacorenode-🪢
This repository contains my Java Core practice projects created in Eclipse IDE. It documents my consistent learning journey, covering fundamental concepts and hands-on implementations. The purpose of this repo is to showcase my progress, and practical understanding of Java Core 






Commit on 14 APRIL 26 AT 15:48🕟  should have this commit message : 
git commit -m "feat(java-core): detailed exploration of interfaces, lambda, and generics internals (Apr 10–14)" ^
-m "- Apr 10:" ^
-m "  • Interface method types: abstract, default, static, private" ^
-m "  • Access rules: private static methods callable only within interface" ^
-m "  • Limitation: default methods cannot directly access private static methods" ^
-m "  • Clarified purpose of default methods vs static methods" ^
-m "  • Explored main() method inside interface and its use" ^
-m "" ^
-m "- Apr 11:" ^
-m "  • Functional Interface definition (single abstract method rule)" ^
-m "  • Lambda expression syntax and implementation" ^
-m "  • Difference: lambda vs anonymous class (structure and usage)" ^
-m "  • 'this' keyword behavior: lambda (outer class) vs anonymous class (inner object)" ^
-m "  • Multi-line lambda expressions and parameterized lambdas" ^
-m "" ^
-m "- Apr 12:" ^
-m "  • Effectively final variables:" ^
-m "      - definition (no reassignment)" ^
-m "      - why required in lambda (value capture)" ^
-m "      - difference between final and effectively final" ^
-m "  • Variable capture in lambda (by value, not reference)" ^
-m "  • invokedynamic concept:" ^
-m "      - no class file creation for lambda" ^
-m "      - runtime linkage by JVM" ^
-m "      - performance advantage over anonymous class" ^
-m "" ^
-m "- Apr 13:" ^
-m "  • Generics fundamentals:" ^
-m "      - Generic class creation (Box<T>)" ^
-m "      - Type parameter substitution (T → Integer / Student)" ^
-m "      - Type safety enforcement at compile time" ^
-m "  • Difference: Generics vs Object-based implementation" ^
-m "  • Using custom class (Student) as generic type parameter" ^
-m "  • Record usage (Student record auto-generating methods)" ^
-m "" ^
-m "- Apr 14:" ^
-m "  • Internal working of Generics (end-to-end flow):" ^
-m "      - Compile-time type substitution" ^
-m "      - Type checking (type safety)" ^
-m "      - Type erasure (T → Object)" ^
-m "      - Compiler-inserted casting at usage point" ^
-m "  • Clarified casting location:" ^
-m "      - NOT inside generic class" ^
-m "      - ONLY at method call site (e.g., getData())" ^
-m "  • Memory model:" ^
-m "      - Stack: reference variables" ^
-m "      - Heap: Box object → data → actual object (Integer/Student)" ^
-m "  • Runtime behavior:" ^
-m "      - JVM works only with Object after erasure" ^
-m "      - Cast executed at runtime" ^
-m "  • Error scenario:" ^
-m "      - Wrong cast → ClassCastException" ^
-m "" ^
-m "Summary:" ^
-m "  Focused on internal mechanics of Java (compiler + JVM behavior) rather than surface-level syntax, especially around lambda execution and generics lifecycle."
