tests:
	./gradlew test

ci:
	./gradlew connectedAndroidTest && \
	./gradlew test
