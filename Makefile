.PHONY: fix
fix:
	./gradlew spotlessApply

.PHONY: format
format: fix

.PHONY: test
test:
	./gradlew test

.PHONY: run
run:
	./gradlew run