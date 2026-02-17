# Lesson 03 - Core 1.1 IoC & DI

Progressive commit comparisons (GitHub links):

1) Understanding IoC (Inversion of Control)
- Compare: https://github.com/anemdhana/upskilling/compare/54feba7...4249926
- Notes: IoC = container creates objects and injects deps; app code depends on abstractions, not new().
	- Real-world cue: IoC shows up as "don't call us, we'll call you" (framework owns the lifecycle).
	- Testability win: you can swap in fakes or stubs without editing production wiring.
	- Design impact: pushes you toward interface-driven design and smaller, focused services.

2) BeanFactory vs ApplicationContext
- Compare: https://github.com/anemdhana/upskilling/compare/4249926...3832131
- Notes: BeanFactory = basic DI container; ApplicationContext adds events, resource loading, i18n, autowire post-processing.
	- Default in Spring Boot: ApplicationContext (most features assume it).
	- BeanFactory still matters for ultra-light setups or embedding Spring in constrained environments.
	- A common gotcha: eager singleton creation happens with ApplicationContext by default.

3) Bean lifecycle and scopes
- Compare: https://github.com/anemdhana/upskilling/compare/3832131...e5325a3
- Notes: Lifecycle hooks via @PostConstruct/@PreDestroy; singleton = one per context; prototype = new each request.
	- Scope nuance: prototype beans are not fully managed after creation (no @PreDestroy call).
	- Lifecycle ordering: post-processors run before @PostConstruct, so they can alter wiring.
	- Web scopes exist too: request, session, and application (web-aware contexts only).

4) Constructor-based dependency injection
- Compare: https://github.com/anemdhana/upskilling/compare/e5325a3...5d6e96d
- Notes: Preferred for required deps; enables immutability and easy testing; Spring auto-wires single constructor.
	- Avoids nulls: all required collaborators must be provided up front.
	- Great with records or final fields (immutability by design).
	- If multiple constructors exist, add @Autowired to remove ambiguity.

5) Setter-based dependency injection
- Compare: https://github.com/anemdhana/upskilling/compare/5d6e96d...4427f66
- Notes: Optional or mutable deps; allows partial construction but risks incomplete state if not set.
	- Useful for optional collaborators and feature toggles.
	- Combine with @Required or validation to catch missing setup early.
	- Keep setters minimal; too many setters can indicate a class doing too much.

6) Field injection and best practices
- Compare: https://github.com/anemdhana/upskilling/compare/4427f66...502511c
- Notes: Works via reflection; hard to test and hides deps. Prefer constructor injection in production code.
	- Testing pain: requires Spring test context or reflection tricks to set fields.
	- Tooling impact: harder for static analysis to see required dependencies.
	- Acceptable in limited cases like quick demos or legacy code, but avoid for new production code.

7) Circular dependencies and resolution
- Compare: https://github.com/anemdhana/upskilling/compare/502511c...4c20c97
- Notes: Constructor cycles fail; setter + @Lazy can break the cycle; refactor to remove cycles when possible.
	- Design smell: cycles often signal missing abstraction or an overly coupled module.
	- Breakers: introduce an interface, split responsibilities, or use events/callbacks.
	- Spring only resolves setter-based circular refs for singletons by default.

8) @Autowired, @Inject, @Resource
- Compare: https://github.com/anemdhana/upskilling/compare/4c20c97...da82e6f
- Notes: @Autowired (Spring, type-based), @Inject (JSR-330, type-based), @Resource (JSR-250, name-first).
	- @Inject does not support required=false, so use Optional<T> or Provider<T> instead.
	- @Resource is convenient when bean names are meaningful and stable.
	- Prefer one annotation style per codebase for consistency.

9) @Qualifier and @Primary
- Compare: https://github.com/anemdhana/upskilling/compare/da82e6f...945f5de
- Notes: @Qualifier selects a specific bean; @Primary is the default when multiple candidates exist.
	- @Qualifier can be custom annotations for cleaner semantics.
	- @Primary is great for default behavior, but be explicit in critical paths.
	- In tests, @Primary on test beans can simplify overrides.

10) Optional dependencies
- Compare: https://github.com/anemdhana/upskilling/compare/945f5de...0a513ce
- Notes: Use @Autowired(required = false) or Optional<T> to avoid startup failure when a bean is absent.
	- Optional<T> makes the absence explicit and easy to reason about.
	- Also consider ObjectProvider<T> for lazy access and safe iteration.
	- Good fit for integrations that may be disabled in certain profiles.
