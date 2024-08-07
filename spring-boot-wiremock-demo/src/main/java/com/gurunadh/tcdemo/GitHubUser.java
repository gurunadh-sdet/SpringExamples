package com.gurunadh.tcdemo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GitHubUser {
	private Long id;
	private String login;
	private String name;
	private String company;
	private String blog;
	private String location;
	private String email;
	@JsonProperty("bio")
	private String bio;
	@JsonProperty("public_repos")
	private int publicRepos;
	private int followers;
	private int following;
	private boolean hireable;
}
