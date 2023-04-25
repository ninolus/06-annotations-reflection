package ohm.softa.a06.adapter;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import ohm.softa.a06.model.Joke;

import java.io.IOException;

public class JokeArrayAdapter extends TypeAdapter<Joke[]> {
	private final Gson gson;

	public JokeArrayAdapter() {
		gson = new Gson();
	}

	@Override
	public void write(JsonWriter out, Joke[] value) throws IOException {
		/* won't implement because we don't want to send requests to the API */
	}

	@Override
	public Joke[] read(JsonReader in) throws IOException {
		Joke[] result = null;
		in.beginObject();

		while (in.hasNext()) {
			switch (in.nextName()) {
				case "total":
					in.skipValue();
					break;
				case "result":
					result = gson.fromJson(in, Joke[].class);
					break;
			}
		}

		in.endObject();
		return result;
	}
}
