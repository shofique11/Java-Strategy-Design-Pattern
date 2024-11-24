# Java-Strategy-Design-Pattern
Strategy design pattern is one of the behavioral design pattern. 
Strategy pattern is used when we have multiple algorithm for a specific task and client decides
the actual implementation to be used at runtime.

# Key Components of Strategy Pattern:
1. Strategy Interface: Defines a common interface for all supported algorithms.
2. Concrete Strategies: Implementations of the strategy interface, each representing a specific algorithm.
3. Context: Maintains a reference to a strategy object and allows clients to set or change the strategy.

# When to Use:
1. You need to use different algorithms or behaviors at runtime.
2. You want to avoid a lot of conditional (if-else or switch) statements in your code.
3. You want to adhere to the Open-Closed Principle, allowing the addition of new behaviors without modifying existing code.