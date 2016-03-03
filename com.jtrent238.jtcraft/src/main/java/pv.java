/*     */ import java.io.BufferedReader;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.UnsupportedEncodingException;
/*     */ import java.net.HttpURLConnection;
/*     */ import java.net.Proxy;
/*     */ import java.net.ServerSocket;
/*     */ import java.net.URL;
/*     */ import java.util.Map;
/*     */ import java.util.Map.Entry;
/*     */ import java.util.concurrent.atomic.AtomicInteger;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ 
/*     */ public class pv
/*     */ {
/*  16 */   private static final AtomicInteger a = new AtomicInteger(0);
/*  17 */   private static final org.apache.logging.log4j.Logger b = org.apache.logging.log4j.LogManager.getLogger();
/*     */   
/*     */ 
/*     */   public static String a(Map paramMap)
/*     */   {
/*  22 */     StringBuilder localStringBuilder = new StringBuilder();
/*     */     
/*  24 */     for (Map.Entry localEntry : paramMap.entrySet()) {
/*  25 */       if (localStringBuilder.length() > 0) {
/*  26 */         localStringBuilder.append('&');
/*     */       }
/*     */       try
/*     */       {
/*  30 */         localStringBuilder.append(java.net.URLEncoder.encode((String)localEntry.getKey(), "UTF-8"));
/*     */       } catch (UnsupportedEncodingException localUnsupportedEncodingException1) {
/*  32 */         localUnsupportedEncodingException1.printStackTrace();
/*     */       }
/*     */       
/*  35 */       if (localEntry.getValue() != null) {
/*  36 */         localStringBuilder.append('=');
/*     */         try {
/*  38 */           localStringBuilder.append(java.net.URLEncoder.encode(localEntry.getValue().toString(), "UTF-8"));
/*     */         } catch (UnsupportedEncodingException localUnsupportedEncodingException2) {
/*  40 */           localUnsupportedEncodingException2.printStackTrace();
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*  45 */     return localStringBuilder.toString();
/*     */   }
/*     */   
/*     */   public static String a(URL paramURL, Map paramMap, boolean paramBoolean) {
/*  49 */     return a(paramURL, a(paramMap), paramBoolean);
/*     */   }
/*     */   
/*     */   private static String a(URL paramURL, String paramString, boolean paramBoolean) {
/*     */     try {
/*  54 */       Proxy localProxy = MinecraftServer.I() == null ? null : MinecraftServer.I().aq();
/*  55 */       if (localProxy == null) localProxy = Proxy.NO_PROXY;
/*  56 */       HttpURLConnection localHttpURLConnection = (HttpURLConnection)paramURL.openConnection(localProxy);
/*  57 */       localHttpURLConnection.setRequestMethod("POST");
/*  58 */       localHttpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
/*     */       
/*  60 */       localHttpURLConnection.setRequestProperty("Content-Length", "" + paramString.getBytes().length);
/*  61 */       localHttpURLConnection.setRequestProperty("Content-Language", "en-US");
/*     */       
/*  63 */       localHttpURLConnection.setUseCaches(false);
/*  64 */       localHttpURLConnection.setDoInput(true);
/*  65 */       localHttpURLConnection.setDoOutput(true);
/*     */       
/*     */ 
/*  68 */       DataOutputStream localDataOutputStream = new DataOutputStream(localHttpURLConnection.getOutputStream());
/*  69 */       localDataOutputStream.writeBytes(paramString);
/*  70 */       localDataOutputStream.flush();
/*  71 */       localDataOutputStream.close();
/*     */       
/*     */ 
/*  74 */       BufferedReader localBufferedReader = new BufferedReader(new java.io.InputStreamReader(localHttpURLConnection.getInputStream()));
/*     */       
/*  76 */       StringBuffer localStringBuffer = new StringBuffer();
/*     */       String str;
/*  78 */       while ((str = localBufferedReader.readLine()) != null) {
/*  79 */         localStringBuffer.append(str);
/*  80 */         localStringBuffer.append('\r');
/*     */       }
/*     */       
/*  83 */       localBufferedReader.close();
/*  84 */       return localStringBuffer.toString();
/*     */     } catch (Exception localException) {
/*  86 */       if (!paramBoolean)
/*  87 */         b.error("Could not post to " + paramURL, localException);
/*     */     }
/*  89 */     return "";
/*     */   }
/*     */   
/*     */   public static void a(java.io.File paramFile, String paramString, px parampx, Map paramMap, int paramInt, qk paramqk, Proxy paramProxy)
/*     */   {
/*  94 */     Thread localThread = new Thread(new pw(paramqk, paramString, paramProxy, paramMap, paramFile, parampx, paramInt), "File Downloader #" + a.incrementAndGet());
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 176 */     localThread.setDaemon(true);
/* 177 */     localThread.start();
/*     */   }
/*     */   
/*     */   public static int a() {
/* 181 */     ServerSocket localServerSocket = null;
/* 182 */     i = -1;
/*     */     try
/*     */     {
/* 185 */       localServerSocket = new ServerSocket(0);
/* 186 */       return localServerSocket.getLocalPort();
/*     */     } finally {
/*     */       try {
/* 189 */         if (localServerSocket != null) {
/* 190 */           localServerSocket.close();
/*     */         }
/*     */       }
/*     */       catch (IOException localIOException2) {}
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static String a(URL paramURL)
/*     */   {
/* 230 */     HttpURLConnection localHttpURLConnection = (HttpURLConnection)paramURL.openConnection();
/* 231 */     localHttpURLConnection.setRequestMethod("GET");
/*     */     
/*     */ 
/* 234 */     BufferedReader localBufferedReader = new BufferedReader(new java.io.InputStreamReader(localHttpURLConnection.getInputStream()));
/*     */     
/* 236 */     StringBuilder localStringBuilder = new StringBuilder();
/*     */     String str;
/* 238 */     while ((str = localBufferedReader.readLine()) != null) {
/* 239 */       localStringBuilder.append(str);
/* 240 */       localStringBuilder.append('\r');
/*     */     }
/*     */     
/* 243 */     localBufferedReader.close();
/* 244 */     return localStringBuilder.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\pv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */