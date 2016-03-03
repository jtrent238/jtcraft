/*     */ import java.io.DataOutputStream;
/*     */ import java.io.File;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import java.net.Proxy;
/*     */ import java.net.URL;
/*     */ import java.net.URLConnection;
/*     */ import java.util.Map;
/*     */ import java.util.Map.Entry;
/*     */ import java.util.Set;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ final class pw
/*     */   implements Runnable
/*     */ {
/*     */   pw(qk paramqk, String paramString, Proxy paramProxy, Map paramMap, File paramFile, px parampx, int paramInt) {}
/*     */   
/*     */   public void run()
/*     */   {
/*  97 */     URLConnection localURLConnection = null;
/*  98 */     InputStream localInputStream = null;
/*  99 */     DataOutputStream localDataOutputStream = null;
/*     */     
/* 101 */     if (this.a != null) {
/* 102 */       this.a.b("Downloading Texture Pack");
/* 103 */       this.a.c("Making Request...");
/*     */     }
/*     */     try
/*     */     {
/* 107 */       byte[] arrayOfByte = new byte['က'];
/* 108 */       URL localURL = new URL(this.b);
/* 109 */       localURLConnection = localURL.openConnection(this.c);
/* 110 */       float f1 = 0.0F;
/* 111 */       float f2 = this.d.entrySet().size();
/*     */       
/* 113 */       for (Map.Entry localEntry : this.d.entrySet()) {
/* 114 */         localURLConnection.setRequestProperty((String)localEntry.getKey(), (String)localEntry.getValue());
/* 115 */         if (this.a != null) { this.a.a((int)(++f1 / f2 * 100.0F));
/*     */         }
/*     */       }
/* 118 */       localInputStream = localURLConnection.getInputStream();
/* 119 */       f2 = localURLConnection.getContentLength();
/* 120 */       int i = localURLConnection.getContentLength();
/*     */       
/* 122 */       if (this.a != null) {
/* 123 */         this.a.c(String.format("Downloading file (%.2f MB)...", new Object[] { Float.valueOf(f2 / 1000.0F / 1000.0F) }));
/*     */       }
/*     */       
/* 126 */       if (this.e.exists()) {
/* 127 */         long l = this.e.length();
/*     */         
/* 129 */         if (l == i) {
/* 130 */           this.f.a(this.e);
/* 131 */           if (this.a != null) this.a.a();
/*     */           return;
/*     */         }
/* 134 */         pv.b().warn("Deleting " + this.e + " as it does not match what we currently have (" + i + " vs our " + l + ").");
/* 135 */         this.e.delete();
/*     */       }
/* 137 */       else if (this.e.getParentFile() != null) {
/* 138 */         this.e.getParentFile().mkdirs();
/*     */       }
/*     */       
/* 141 */       localDataOutputStream = new DataOutputStream(new FileOutputStream(this.e));
/*     */       
/* 143 */       if ((this.g > 0) && (f2 > this.g)) {
/* 144 */         if (this.a != null) this.a.a();
/* 145 */         throw new IOException("Filesize is bigger than maximum allowed (file is " + f1 + ", limit is " + this.g + ")");
/*     */       }
/*     */       
/* 148 */       int j = 0;
/* 149 */       while ((j = localInputStream.read(arrayOfByte)) >= 0) {
/* 150 */         f1 += j;
/* 151 */         if (this.a != null) { this.a.a((int)(f1 / f2 * 100.0F));
/*     */         }
/* 153 */         if ((this.g > 0) && (f1 > this.g)) {
/* 154 */           if (this.a != null) this.a.a();
/* 155 */           throw new IOException("Filesize was bigger than maximum allowed (got >= " + f1 + ", limit was " + this.g + ")");
/*     */         }
/*     */         
/* 158 */         localDataOutputStream.write(arrayOfByte, 0, j);
/*     */       }
/*     */       
/* 161 */       this.f.a(this.e);
/* 162 */       if (this.a != null) this.a.a();
/*     */       return;
/* 164 */     } catch (Throwable localThrowable) { localThrowable.printStackTrace();
/*     */     } finally {
/*     */       try {
/* 167 */         if (localInputStream != null) localInputStream.close();
/*     */       } catch (IOException localIOException7) {}
/*     */       try {
/* 170 */         if (localDataOutputStream != null) localDataOutputStream.close();
/*     */       }
/*     */       catch (IOException localIOException8) {}
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\pw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */