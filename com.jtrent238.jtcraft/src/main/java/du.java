/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.DataInput;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutput;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ 
/*     */ public class du
/*     */ {
/*     */   public static dh a(java.io.InputStream paramInputStream)
/*     */   {
/*  13 */     DataInputStream localDataInputStream = new DataInputStream(new java.io.BufferedInputStream(new java.util.zip.GZIPInputStream(paramInputStream)));
/*     */     try {
/*  15 */       return a(localDataInputStream, ds.a);
/*     */     } finally {
/*  17 */       localDataInputStream.close();
/*     */     }
/*     */   }
/*     */   
/*     */   public static void a(dh paramdh, java.io.OutputStream paramOutputStream) {
/*  22 */     DataOutputStream localDataOutputStream = new DataOutputStream(new java.io.BufferedOutputStream(new java.util.zip.GZIPOutputStream(paramOutputStream)));
/*     */     try {
/*  24 */       a(paramdh, localDataOutputStream);
/*     */     } finally {
/*  26 */       localDataOutputStream.close();
/*     */     }
/*     */   }
/*     */   
/*     */   public static dh a(byte[] paramArrayOfByte, ds paramds) {
/*  31 */     DataInputStream localDataInputStream = new DataInputStream(new java.io.BufferedInputStream(new java.util.zip.GZIPInputStream(new java.io.ByteArrayInputStream(paramArrayOfByte))));
/*     */     try {
/*  33 */       return a(localDataInputStream, paramds);
/*     */     } finally {
/*  35 */       localDataInputStream.close();
/*     */     }
/*     */   }
/*     */   
/*     */   public static byte[] a(dh paramdh) {
/*  40 */     ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
/*  41 */     DataOutputStream localDataOutputStream = new DataOutputStream(new java.util.zip.GZIPOutputStream(localByteArrayOutputStream));
/*     */     try {
/*  43 */       a(paramdh, localDataOutputStream);
/*     */     } finally {
/*  45 */       localDataOutputStream.close();
/*     */     }
/*  47 */     return localByteArrayOutputStream.toByteArray();
/*     */   }
/*     */   
/*     */   public static void a(dh paramdh, File paramFile) {
/*  51 */     File localFile = new File(paramFile.getAbsolutePath() + "_tmp");
/*  52 */     if (localFile.exists()) localFile.delete();
/*  53 */     b(paramdh, localFile);
/*  54 */     if (paramFile.exists()) paramFile.delete();
/*  55 */     if (paramFile.exists()) throw new IOException("Failed to delete " + paramFile);
/*  56 */     localFile.renameTo(paramFile);
/*     */   }
/*     */   
/*     */   public static void b(dh paramdh, File paramFile) {
/*  60 */     DataOutputStream localDataOutputStream = new DataOutputStream(new java.io.FileOutputStream(paramFile));
/*     */     try {
/*  62 */       a(paramdh, localDataOutputStream);
/*     */     } finally {
/*  64 */       localDataOutputStream.close();
/*     */     }
/*     */   }
/*     */   
/*     */   public static dh a(File paramFile) {
/*  69 */     return a(paramFile, ds.a);
/*     */   }
/*     */   
/*     */   public static dh a(File paramFile, ds paramds) {
/*  73 */     if (!paramFile.exists()) {
/*  74 */       return null;
/*     */     }
/*  76 */     DataInputStream localDataInputStream = new DataInputStream(new java.io.FileInputStream(paramFile));
/*     */     try {
/*  78 */       return a(localDataInputStream, paramds);
/*     */     } finally {
/*  80 */       localDataInputStream.close();
/*     */     }
/*     */   }
/*     */   
/*     */   public static dh a(DataInputStream paramDataInputStream) {
/*  85 */     return a(paramDataInputStream, ds.a);
/*     */   }
/*     */   
/*     */   public static dh a(DataInput paramDataInput, ds paramds) {
/*  89 */     dy localdy = a(paramDataInput, 0, paramds);
/*  90 */     if ((localdy instanceof dh)) {
/*  91 */       return (dh)localdy;
/*     */     }
/*  93 */     throw new IOException("Root tag must be a named compound tag");
/*     */   }
/*     */   
/*     */   public static void a(dh paramdh, DataOutput paramDataOutput) {
/*  97 */     a(paramdh, paramDataOutput);
/*     */   }
/*     */   
/*     */   private static void a(dy paramdy, DataOutput paramDataOutput) {
/* 101 */     paramDataOutput.writeByte(paramdy.a());
/* 102 */     if (paramdy.a() == 0) { return;
/*     */     }
/*     */     
/* 105 */     paramDataOutput.writeUTF("");
/*     */     
/* 107 */     paramdy.a(paramDataOutput);
/*     */   }
/*     */   
/*     */   private static dy a(DataInput paramDataInput, int paramInt, ds paramds) {
/* 111 */     byte b = paramDataInput.readByte();
/* 112 */     if (b == 0) { return new dl();
/*     */     }
/*     */     
/* 115 */     paramDataInput.readUTF();
/*     */     
/* 117 */     dy localdy = dy.a(b);
/*     */     try
/*     */     {
/* 120 */       localdy.a(paramDataInput, paramInt, paramds);
/*     */     } catch (IOException localIOException) {
/* 122 */       b localb = b.a(localIOException, "Loading NBT data");
/* 123 */       k localk = localb.a("NBT Tag");
/* 124 */       localk.a("Tag name", "[UNNAMED TAG]");
/* 125 */       localk.a("Tag type", Byte.valueOf(b));
/* 126 */       throw new s(localb);
/*     */     }
/*     */     
/* 129 */     return localdy;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\du.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */