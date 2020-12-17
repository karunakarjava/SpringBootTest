package com.app.serviceimpl;

/*@Service
public class CustomUserDetailsService implements UserDetailsService{


	@Autowired
	private UserRepo userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=userRepository.findByUserEmail(username);
		if(user==null) {
			throw new UsernameNotFoundException("Invalid username or Password");
		}
		return new org.springframework.security.core.userdetails.User(user.getUserEmail(),user.getUserPwd(),getAuthority(user));
	}

	private Collection<? extends GrantedAuthority> getAuthority(User user) {
		 Set<SimpleGrantedAuthority> authorities = new HashSet<>();
		 user.getRoles().forEach(role->{authorities.add(new SimpleGrantedAuthority("ROLE_"+role.getRoleName()));});
		return authorities;
	}
	


}*/

