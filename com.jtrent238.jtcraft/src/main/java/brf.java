/*     */ import java.awt.image.BufferedImage;
/*     */ import java.io.Closeable;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import org.apache.commons.io.IOUtils;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class brf
/*     */ {
/*     */   private final File b;
/*     */   private bra c;
/*     */   private bsg d;
/*     */   private BufferedImage e;
/*     */   private bqx f;
/*     */   
/*     */   private brf(brc parambrc, File paramFile)
/*     */   {
/* 183 */     this.b = paramFile;
/*     */   }
/*     */   
/*     */   public void a() {
/* 187 */     this.c = (this.b.isDirectory() ? new bqs(this.b) : new bqr(this.b));
/*     */     
/* 189 */     this.d = ((bsg)this.c.a(this.a.c, "pack"));
/*     */     try {
/* 191 */       this.e = this.c.a();
/*     */     }
/*     */     catch (IOException localIOException) {}
/* 194 */     if (this.e == null) {
/* 195 */       this.e = this.a.b.a();
/*     */     }
/*     */     
/* 198 */     b();
/*     */   }
/*     */   
/*     */   public void a(bqf parambqf) {
/* 202 */     if (this.f == null) {
/* 203 */       this.f = parambqf.a("texturepackicon", new bpq(this.e));
/*     */     }
/* 205 */     parambqf.a(this.f);
/*     */   }
/*     */   
/*     */   public void b() {
/* 209 */     if ((this.c instanceof Closeable)) {
/* 210 */       IOUtils.closeQuietly((Closeable)this.c);
/*     */     }
/*     */   }
/*     */   
/*     */   public bra c() {
/* 215 */     return this.c;
/*     */   }
/*     */   
/*     */   public String d() {
/* 219 */     return this.c.b();
/*     */   }
/*     */   
/*     */   public String e() {
/* 223 */     return this.d == null ? a.m + "Invalid pack.mcmeta (or missing 'pack' section)" : this.d.a().d();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object paramObject)
/*     */   {
/* 232 */     if (this == paramObject) { return true;
/*     */     }
/* 234 */     if ((paramObject instanceof brf)) {
/* 235 */       return toString().equals(paramObject.toString());
/*     */     }
/*     */     
/* 238 */     return false;
/*     */   }
/*     */   
/*     */   public int hashCode()
/*     */   {
/* 243 */     return toString().hashCode();
/*     */   }
/*     */   
/*     */   public String toString()
/*     */   {
/* 248 */     return String.format("%s:%s:%d", new Object[] { this.b.getName(), this.b.isDirectory() ? "folder" : "zip", Long.valueOf(this.b.lastModified()) });
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\brf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */