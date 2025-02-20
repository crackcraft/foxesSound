package foxesSound.decoder;

/**
 * Exception erorr codes for components of the JavaLayer API.
 */
public interface JavaLayerErrors
{
	/**
	 * The first bitstream error code. See the {@link DecoderErrors DecoderErrors}
	 * interface for other bitstream error codes.
	 */
	static public final int BITSTREAM_ERROR = 0x100;

	/**
	 * The first decoder error code. See the {@link DecoderErrors DecoderErrors}
	 * interface for other decoder error codes.
	 */
	static public final int DECODER_ERROR = 0x200;

}
