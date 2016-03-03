import tv.twitch.AuthToken;
import tv.twitch.ErrorCode;
import tv.twitch.broadcast.GameInfo;
import tv.twitch.broadcast.IngestList;
import tv.twitch.broadcast.StreamInfo;

public abstract interface bud
{
  public abstract void a(ErrorCode paramErrorCode, AuthToken paramAuthToken);
  
  public abstract void a(ErrorCode paramErrorCode);
  
  public abstract void a(ErrorCode paramErrorCode, GameInfo[] paramArrayOfGameInfo);
  
  public abstract void a(buc parambuc);
  
  public abstract void a();
  
  public abstract void a(StreamInfo paramStreamInfo);
  
  public abstract void a(IngestList paramIngestList);
  
  public abstract void b(ErrorCode paramErrorCode);
  
  public abstract void b();
  
  public abstract void c();
  
  public abstract void c(ErrorCode paramErrorCode);
}


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bud.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */