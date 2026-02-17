# Lesson 03 - Core 1.1 IoC & DI

Progressive commit comparisons (GitHub links):

1) Understanding IoC (Inversion of Control)
- Compare: https://github.com/anemdhana/upskilling/compare/54feba7...4249926
- Notes: IoC = container creates objects and injects deps; app code depends on abstractions, not new().

2) BeanFactory vs ApplicationContext
- Compare: https://github.com/anemdhana/upskilling/compare/4249926...3832131
- Notes: BeanFactory = basic DI container; ApplicationContext adds events, resource loading, i18n, autowire post-processing.

3) Bean lifecycle and scopes
- Compare: https://github.com/anemdhana/upskilling/compare/3832131...e5325a3
- Notes: Lifecycle hooks via @PostConstruct/@PreDestroy; singleton = one per context; prototype = new each request.

4) Constructor-based dependency injection
- Compare: https://github.com/anemdhana/upskilling/compare/e5325a3...5d6e96d
- Notes: Preferred for required deps; enables immutability and easy testing; Spring auto-wires single constructor.

5) Setter-based dependency injection
- Compare: https://github.com/anemdhana/upskilling/compare/5d6e96d...4427f66
- Notes: Optional or mutable deps; allows partial construction but risks incomplete state if not set.

6) Field injection and best practices
- Compare: https://github.com/anemdhana/upskilling/compare/4427f66...502511c
- Notes: Works via reflection; hard to test and hides deps. Prefer constructor injection in production code.

7) Circular dependencies and resolution
- Compare: https://github.com/anemdhana/upskilling/compare/502511c...4c20c97
- Notes: Constructor cycles fail; setter + @Lazy can break the cycle; refactor to remove cycles when possible.

8) @Autowired, @Inject, @Resource
- Compare: https://github.com/anemdhana/upskilling/compare/4c20c97...da82e6f
- Notes: @Autowired (Spring, type-based), @Inject (JSR-330, type-based), @Resource (JSR-250, name-first).

9) @Qualifier and @Primary
- Compare: https://github.com/anemdhana/upskilling/compare/da82e6f...945f5de
- Notes: @Qualifier selects a specific bean; @Primary is the default when multiple candidates exist.

10) Optional dependencies
- Compare: https://github.com/anemdhana/upskilling/compare/945f5de...0a513ce
- Notes: Use @Autowired(required = false) or Optional<T> to avoid startup failure when a bean is absent.
