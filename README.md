Demonstrates how to build a simple Gradle plugin and publish it to GitHub Packages.

Unlike the default method of publishing to GitHub Packages, this repo uses [an alternative method](https://dev.to/jakub_zalas/how-to-publish-maven-packages-to-a-single-github-repository-3lkc) (tl;dr use the Maven repo URL of another GH repo, use a PAT with all repo and package scopes instead of the default `GITHUB_TOKEN`) to publish artefacts to a [separate package repository](https://github.com/valderman/gradle-plugin-on-github-packages-maven-repo). This allows for packages from multiple source repositories to be published to the same package repository.

For the consumer counterpart, see [gradle-plugin-from-github-packages](https://github.com/valderman/gradle-plugin-from-github-packages/).
