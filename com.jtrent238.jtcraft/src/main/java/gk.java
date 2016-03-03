/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.IOException;
/*     */ import org.apache.logging.log4j.LogManager;
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
/*     */ public class gk
/*     */   extends ft
/*     */ {
/*  18 */   private static final Logger a = ;
/*     */   
/*     */   private agu b;
/*     */   
/*     */   private byte[] c;
/*     */   private int d;
/*     */   
/*     */   public gk() {}
/*     */   
/*     */   public gk(int paramInt, short[] paramArrayOfShort, apx paramapx)
/*     */   {
/*  29 */     this.b = new agu(paramapx.g, paramapx.h);
/*  30 */     this.d = paramInt;
/*     */     
/*  32 */     int i = 4 * paramInt;
/*     */     try
/*     */     {
/*  35 */       ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(i);
/*  36 */       DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
/*     */       
/*  38 */       for (int j = 0; j < paramInt; j++) {
/*  39 */         int k = paramArrayOfShort[j] >> 12 & 0xF;
/*  40 */         int m = paramArrayOfShort[j] >> 8 & 0xF;
/*  41 */         int n = paramArrayOfShort[j] & 0xFF;
/*     */         
/*  43 */         localDataOutputStream.writeShort(paramArrayOfShort[j]);
/*  44 */         localDataOutputStream.writeShort((short)((aji.b(paramapx.a(k, n, m)) & 0xFFF) << 4 | paramapx.c(k, n, m) & 0xF));
/*     */       }
/*     */       
/*  47 */       this.c = localByteArrayOutputStream.toByteArray();
/*  48 */       if (this.c.length != i) {
/*  49 */         throw new RuntimeException("Expected length " + i + " doesn't match received length " + this.c.length);
/*     */       }
/*     */     } catch (IOException localIOException) {
/*  52 */       a.error("Couldn't create bulk block update packet", localIOException);
/*  53 */       this.c = null;
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(et paramet)
/*     */   {
/*  59 */     this.b = new agu(paramet.readInt(), paramet.readInt());
/*  60 */     this.d = (paramet.readShort() & 0xFFFF);
/*  61 */     int i = paramet.readInt();
/*  62 */     if (i > 0) {
/*  63 */       this.c = new byte[i];
/*  64 */       paramet.readBytes(this.c);
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(et paramet)
/*     */   {
/*  70 */     paramet.writeInt(this.b.a);
/*  71 */     paramet.writeInt(this.b.b);
/*  72 */     paramet.writeShort((short)this.d);
/*  73 */     if (this.c != null) {
/*  74 */       paramet.writeInt(this.c.length);
/*  75 */       paramet.writeBytes(this.c);
/*     */     } else {
/*  77 */       paramet.writeInt(0);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(fv paramfv)
/*     */   {
/*  83 */     paramfv.a(this);
/*     */   }
/*     */   
/*     */   public String b()
/*     */   {
/*  88 */     return String.format("xc=%d, zc=%d, count=%d", new Object[] { Integer.valueOf(this.b.a), Integer.valueOf(this.b.b), Integer.valueOf(this.d) });
/*     */   }
/*     */   
/*     */   public agu c() {
/*  92 */     return this.b;
/*     */   }
/*     */   
/*     */   public byte[] d() {
/*  96 */     return this.c;
/*     */   }
/*     */   
/*     */   public int e() {
/* 100 */     return this.d;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\gk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */