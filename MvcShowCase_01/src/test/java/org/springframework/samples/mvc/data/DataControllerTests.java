package org.springframework.samples.mvc.data;

import static org.hamcrest.Matchers.startsWith;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.MediaType;
import org.springframework.samples.mvc.AbstractContextControllerTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringJUnit4ClassRunner.class)
public class DataControllerTests extends AbstractContextControllerTests {

	private MockMvc mockMvc;

	@Before
	public void setup() throws Exception {
		this.mockMvc = webAppContextSetup(this.wac).alwaysExpect(status().isOk()).build();
	}
	@Ignore
	@Test
	public void param() throws Exception {
		this.mockMvc.perform(get("/data/param?foo=bar"))
		.andDo(print())
				.andExpect(content().string("Obtained 'foo' query parameter value 'bar'"));
	}
	@Ignore
	@Test
	public void group() throws Exception {
		this.mockMvc.perform(get("/data/group?param1=foo&param2=bar&param3=baz"))
		.andDo(print()).andExpect(content().string(startsWith(
						"Obtained parameter group org.springframework.samples.mvc.data.JavaBean@")));
	}
    @Ignore
	@Test
	public void pathVar() throws Exception {
		this.mockMvc.perform(get("/data/path/foo"))
		.andDo(print())
				.andExpect(content().string("Obtained 'var' path variable value 'foo'"));
	}
    @Ignore
	@Test
	public void matrixVar() throws Exception {
		this.mockMvc.perform(get("/data/matrixvars;foo=bar/simple"))
		.andDo(print()).andExpect(content().string("Obtained matrix variable 'foo=bar' from path segment 'matrixvars'"));
	}
    @Ignore
	@Test
	public void matrixVarMultiple() throws Exception {
		this.mockMvc.perform(get("/data/matrixvars;foo=bar1/multiple;foo=bar2"))
		.andDo(print())	.andExpect(content().string("Obtained matrix variable foo=bar1 from path segment 'matrixvars' and variable 'foo=bar2 from path segment 'multiple'"));
	}
    @Ignore
	@Test
	public void header() throws Exception {
		this.mockMvc.perform(get("/data/header").accept(MediaType.ALL))
		.andDo(print()).andExpect(content().string("Obtained 'Accept' header '*/*'"));
	}
    @Ignore
	@Test
	public void requestBody() throws Exception {
		this.mockMvc.perform(
				post("/data/body")
					.contentType(MediaType.TEXT_PLAIN)
					.content("foo".getBytes()))
		.andDo(print())
				.andExpect(content().string("Posted request body 'foo'"));
	}
    @Ignore
	@Test
	public void requestBodyAndHeaders() throws Exception {
		this.mockMvc.perform(
				post("/data/entity")
					.contentType(MediaType.TEXT_PLAIN)
					.content("foo".getBytes()))
		        .andDo(print())
				.andExpect(content().string(
						"Posted request body 'foo'; headers = {Content-Type=[text/plain], Content-Length=[3]}"));
	}

}
