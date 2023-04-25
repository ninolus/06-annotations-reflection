package ohm.softa.a06.adapter;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import ohm.softa.a06.model.Joke;
import org.apache.commons.lang3.NotImplementedException;

import java.io.IOException;

public class JokeAdapter extends TypeAdapter<Joke> {

	private final Gson gson;

	public JokeAdapter() {
		gson = new Gson();
	}

	@Override
	public void write(JsonWriter out, Joke value) {
		throw new NotImplementedException();
	}

	@Override
	public Joke read(JsonReader in) {
		Joke result = null;

		result = gson.fromJson(in, Joke.class);

		return result;
	}
}
