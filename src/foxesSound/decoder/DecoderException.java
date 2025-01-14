package foxesSound.decoder;

/**
 * The <code>DecoderException</code> represents the class of
 * errors that can occur when decoding MPEG audio. 
 * 
 * @author MDM
 */
public class DecoderException extends JavaLayerException
	implements DecoderErrors
{	
	private int		errorcode = UNKNOWN_ERROR;
	
	public DecoderException(String msg, Throwable t)
	{
		super(msg, t);	
	}
	
	public DecoderException(int errorcode, Throwable t)
	{
		this(getErrorString(errorcode), t);
		this.errorcode = errorcode;
	}
	
	public int getErrorCode()
	{
		return errorcode;	
	}
	
	
	static public String getErrorString(int errorcode)
	{
		// REVIEW: use resource file to map error codes
		// to locale-sensitive strings. 
		
		return "Decoder errorcode "+Integer.toHexString(errorcode);
	}
	
	
}

