tests:
	./gradlew test

ci:
	./gradlew connectedMockDebugAndroidTest && \
	./gradlew test
